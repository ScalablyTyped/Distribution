package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The runtime logging config of the job.
  */
trait SchemaLoggingConfig extends StObject {
  
  /**
    * The per-package log levels for the driver. This may include
    * &quot;root&quot; package name to configure rootLogger. Examples:
    * &#39;com.google = FATAL&#39;, &#39;root = INFO&#39;, &#39;org.apache =
    * DEBUG&#39;
    */
  var driverLogLevels: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaLoggingConfig {
  
  @scala.inline
  def apply(): SchemaLoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLoggingConfig]
  }
  
  @scala.inline
  implicit class SchemaLoggingConfigMutableBuilder[Self <: SchemaLoggingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriverLogLevels(value: StringDictionary[String]): Self = StObject.set(x, "driverLogLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverLogLevelsUndefined: Self = StObject.set(x, "driverLogLevels", js.undefined)
  }
}
