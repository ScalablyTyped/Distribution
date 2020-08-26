package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of a test environment.
  */
@js.native
trait SchemaTestEnvironmentCatalog extends js.Object {
  /**
    * Supported Android devices.
    */
  var androidDeviceCatalog: js.UndefOr[SchemaAndroidDeviceCatalog] = js.native
  /**
    * Supported iOS devices.
    */
  var iosDeviceCatalog: js.UndefOr[SchemaIosDeviceCatalog] = js.native
  /**
    * Supported network configurations.
    */
  var networkConfigurationCatalog: js.UndefOr[SchemaNetworkConfigurationCatalog] = js.native
  /**
    * The software test environment provided by TestExecutionService.
    */
  var softwareCatalog: js.UndefOr[SchemaProvidedSoftwareCatalog] = js.native
}

object SchemaTestEnvironmentCatalog {
  @scala.inline
  def apply(): SchemaTestEnvironmentCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestEnvironmentCatalog]
  }
  @scala.inline
  implicit class SchemaTestEnvironmentCatalogOps[Self <: SchemaTestEnvironmentCatalog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAndroidDeviceCatalog(value: SchemaAndroidDeviceCatalog): Self = this.set("androidDeviceCatalog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidDeviceCatalog: Self = this.set("androidDeviceCatalog", js.undefined)
    @scala.inline
    def setIosDeviceCatalog(value: SchemaIosDeviceCatalog): Self = this.set("iosDeviceCatalog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosDeviceCatalog: Self = this.set("iosDeviceCatalog", js.undefined)
    @scala.inline
    def setNetworkConfigurationCatalog(value: SchemaNetworkConfigurationCatalog): Self = this.set("networkConfigurationCatalog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkConfigurationCatalog: Self = this.set("networkConfigurationCatalog", js.undefined)
    @scala.inline
    def setSoftwareCatalog(value: SchemaProvidedSoftwareCatalog): Self = this.set("softwareCatalog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoftwareCatalog: Self = this.set("softwareCatalog", js.undefined)
  }
  
}

