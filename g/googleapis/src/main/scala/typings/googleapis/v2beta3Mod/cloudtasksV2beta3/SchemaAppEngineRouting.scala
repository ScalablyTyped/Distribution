package typings.googleapis.v2beta3Mod.cloudtasksV2beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * App Engine Routing.  Defines routing characteristics specific to App Engine
  * - service, version, and instance.  For more information about services,
  * versions, and instances see [An Overview of App
  * Engine](https://cloud.google.com/appengine/docs/python/an-overview-of-app-engine),
  * [Microservices Architecture on Google App
  * Engine](https://cloud.google.com/appengine/docs/python/microservices-on-app-engine),
  * [App Engine Standard request
  * routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed),
  * and [App Engine Flex request
  * routing](https://cloud.google.com/appengine/docs/flexible/python/how-requests-are-routed).
  */
@js.native
trait SchemaAppEngineRouting extends js.Object {
  /**
    * Output only. The host that the task is sent to.  The host is constructed
    * from the domain name of the app associated with the queue&#39;s project
    * ID (for example &lt;app-id&gt;.appspot.com), and the service, version,
    * and instance. Tasks which were created using the App Engine SDK might
    * have a custom domain name.  For more information, see [How Requests are
    * Routed](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed).
    */
  var host: js.UndefOr[String] = js.native
  /**
    * App instance.  By default, the task is sent to an instance which is
    * available when the task is attempted.  Requests can only be sent to a
    * specific instance if [manual scaling is used in App Engine
    * Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-engine?hl=en_US#scaling_types_and_instance_classes).
    * App Engine Flex does not support instances. For more information, see
    * [App Engine Standard request
    * routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed)
    * and [App Engine Flex request
    * routing](https://cloud.google.com/appengine/docs/flexible/python/how-requests-are-routed).
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * App service.  By default, the task is sent to the service which is the
    * default service when the task is attempted.  For some queues or tasks
    * which were created using the App Engine Task Queue API, host is not
    * parsable into service, version, and instance. For example, some tasks
    * which were created using the App Engine SDK use a custom domain name;
    * custom domains are not parsed by Cloud Tasks. If host is not parsable,
    * then service, version, and instance are the empty string.
    */
  var service: js.UndefOr[String] = js.native
  /**
    * App version.  By default, the task is sent to the version which is the
    * default version when the task is attempted.  For some queues or tasks
    * which were created using the App Engine Task Queue API, host is not
    * parsable into service, version, and instance. For example, some tasks
    * which were created using the App Engine SDK use a custom domain name;
    * custom domains are not parsed by Cloud Tasks. If host is not parsable,
    * then service, version, and instance are the empty string.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaAppEngineRouting {
  @scala.inline
  def apply(host: String = null, instance: String = null, service: String = null, version: String = null): SchemaAppEngineRouting = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAppEngineRouting]
  }
}

