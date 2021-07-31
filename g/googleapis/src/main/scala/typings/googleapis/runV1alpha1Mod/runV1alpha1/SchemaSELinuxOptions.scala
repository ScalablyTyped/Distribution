package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SELinuxOptions are the labels to be applied to the container
  */
trait SchemaSELinuxOptions extends StObject {
  
  /**
    * Level is SELinux level label that applies to the container. +optional
    */
  var level: js.UndefOr[String] = js.undefined
  
  /**
    * Role is a SELinux role label that applies to the container. +optional
    */
  var role: js.UndefOr[String] = js.undefined
  
  /**
    * Type is a SELinux type label that applies to the container. +optional
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * User is a SELinux user label that applies to the container. +optional
    */
  var user: js.UndefOr[String] = js.undefined
}
object SchemaSELinuxOptions {
  
  @scala.inline
  def apply(): SchemaSELinuxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSELinuxOptions]
  }
  
  @scala.inline
  implicit class SchemaSELinuxOptionsMutableBuilder[Self <: SchemaSELinuxOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
