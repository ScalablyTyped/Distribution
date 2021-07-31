package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A RuntimeConfig resource is the primary resource in the Cloud RuntimeConfig
  * service. A RuntimeConfig resource consists of metadata and a hierarchy of
  * variables.
  */
trait SchemaRuntimeConfig extends StObject {
  
  /**
    * An optional description of the RuntimeConfig object.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of a runtime config. The name must have the format:
    * projects/[PROJECT_ID]/configs/[CONFIG_NAME]  The `[PROJECT_ID]` must be a
    * valid project ID, and `[CONFIG_NAME]` is an arbitrary name that matches
    * the `[0-9A-Za-z](?:[_.A-Za-z0-9-]{0,62}[_.A-Za-z0-9])?` regular
    * expression. The length of `[CONFIG_NAME]` must be less than 64
    * characters.  You pick the RuntimeConfig resource name, but the server
    * will validate that the name adheres to this format. After you create the
    * resource, you cannot change the resource&#39;s name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaRuntimeConfig {
  
  @scala.inline
  def apply(): SchemaRuntimeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntimeConfig]
  }
  
  @scala.inline
  implicit class SchemaRuntimeConfigMutableBuilder[Self <: SchemaRuntimeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
