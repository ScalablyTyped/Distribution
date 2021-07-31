package typings.maximMazurokGapiClientCloudtasks.gapi.client.cloudtasks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppEngineRouting extends StObject {
  
  /**
    * Output only. The host that the task is sent to. The host is constructed from the domain name of the app associated with the queue's project ID (for example .appspot.com), and the
    * service, version, and instance. Tasks which were created using the App Engine SDK might have a custom domain name. For more information, see [How Requests are
    * Routed](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed).
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * App instance. By default, the task is sent to an instance which is available when the task is attempted. Requests can only be sent to a specific instance if [manual scaling is used
    * in App Engine Standard](https://cloud.google.com/appengine/docs/python/an-overview-of-app-engine?hl=en_US#scaling_types_and_instance_classes). App Engine Flex does not support
    * instances. For more information, see [App Engine Standard request routing](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed) and [App Engine Flex
    * request routing](https://cloud.google.com/appengine/docs/flexible/python/how-requests-are-routed).
    */
  var instance: js.UndefOr[String] = js.undefined
  
  /**
    * App service. By default, the task is sent to the service which is the default service when the task is attempted. For some queues or tasks which were created using the App Engine
    * Task Queue API, host is not parsable into service, version, and instance. For example, some tasks which were created using the App Engine SDK use a custom domain name; custom
    * domains are not parsed by Cloud Tasks. If host is not parsable, then service, version, and instance are the empty string.
    */
  var service: js.UndefOr[String] = js.undefined
  
  /**
    * App version. By default, the task is sent to the version which is the default version when the task is attempted. For some queues or tasks which were created using the App Engine
    * Task Queue API, host is not parsable into service, version, and instance. For example, some tasks which were created using the App Engine SDK use a custom domain name; custom
    * domains are not parsed by Cloud Tasks. If host is not parsable, then service, version, and instance are the empty string.
    */
  var version: js.UndefOr[String] = js.undefined
}
object AppEngineRouting {
  
  @scala.inline
  def apply(): AppEngineRouting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppEngineRouting]
  }
  
  @scala.inline
  implicit class AppEngineRoutingMutableBuilder[Self <: AppEngineRouting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
