package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of a unique source of sensor data. Data sources can expose raw
  * data coming from hardware sensors on local or companion devices. They can
  * also expose derived data, created by transforming or merging other data
  * sources. Multiple data sources can exist for the same data type. Every data
  * point inserted into or read from this service has an associated data
  * source.  The data source contains enough information to uniquely identify
  * its data, including the hardware device and the application that collected
  * and/or transformed the data. It also holds useful metadata, such as the
  * hardware and application versions, and the device type.  Each data source
  * produces a unique stream of data, with a unique identifier. Not all changes
  * to data source affect the stream identifier, so that data collected by
  * updated versions of the same application/device can still be considered to
  * belong to the same data stream.
  */
@js.native
trait SchemaDataSource extends js.Object {
  /**
    * Information about an application which feeds sensor data into the
    * platform.
    */
  var application: js.UndefOr[SchemaApplication] = js.native
  /**
    * DO NOT POPULATE THIS FIELD. It is never populated in responses from the
    * platform, and is ignored in queries. It will be removed in a future
    * version entirely.
    */
  var dataQualityStandard: js.UndefOr[js.Array[String]] = js.native
  /**
    * A unique identifier for the data stream produced by this data source. The
    * identifier includes:    - The physical device&#39;s manufacturer, model,
    * and serial number (UID).  - The application&#39;s package name or name.
    * Package name is used when the data source was created by an Android
    * application. The developer project number is used when the data source
    * was created by a REST client.  - The data source&#39;s type.  - The data
    * source&#39;s stream name.  Note that not all attributes of the data
    * source are used as part of the stream identifier. In particular, the
    * version of the hardware/the application isn&#39;t used. This allows us to
    * preserve the same stream through version updates. This also means that
    * two DataSource objects may represent the same data stream even if
    * they&#39;re not equal.  The exact format of the data stream ID created by
    * an Android application is:
    * type:dataType.name:application.packageName:device.manufacturer:device.model:device.uid:dataStreamName
    * The exact format of the data stream ID created by a REST client is:
    * type:dataType.name:developer project
    * number:device.manufacturer:device.model:device.uid:dataStreamName   When
    * any of the optional fields that comprise of the data stream ID are blank,
    * they will be omitted from the data stream ID. The minimum viable data
    * stream ID would be: type:dataType.name:developer project number  Finally,
    * the developer project number is obfuscated when read by any REST or
    * Android client that did not create the data source. Only the data source
    * creator will see the developer project number in clear and normal form.
    */
  var dataStreamId: js.UndefOr[String] = js.native
  /**
    * The stream name uniquely identifies this particular data source among
    * other data sources of the same type from the same underlying producer.
    * Setting the stream name is optional, but should be done whenever an
    * application exposes two streams for the same data type, or when a device
    * has two equivalent sensors.
    */
  var dataStreamName: js.UndefOr[String] = js.native
  /**
    * The data type defines the schema for a stream of data being collected by,
    * inserted into, or queried from the Fitness API.
    */
  var dataType: js.UndefOr[SchemaDataType] = js.native
  /**
    * Representation of an integrated device (such as a phone or a wearable)
    * that can hold sensors.
    */
  var device: js.UndefOr[SchemaDevice] = js.native
  /**
    * An end-user visible name for this data source.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A constant describing the type of this data source. Indicates whether
    * this data source produces raw or derived data.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDataSource {
  @scala.inline
  def apply(
    application: SchemaApplication = null,
    dataQualityStandard: js.Array[String] = null,
    dataStreamId: String = null,
    dataStreamName: String = null,
    dataType: SchemaDataType = null,
    device: SchemaDevice = null,
    name: String = null,
    `type`: String = null
  ): SchemaDataSource = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (dataQualityStandard != null) __obj.updateDynamic("dataQualityStandard")(dataQualityStandard.asInstanceOf[js.Any])
    if (dataStreamId != null) __obj.updateDynamic("dataStreamId")(dataStreamId.asInstanceOf[js.Any])
    if (dataStreamName != null) __obj.updateDynamic("dataStreamName")(dataStreamName.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDataSource]
  }
}

