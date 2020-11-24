package typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object IPlugin {
  
  /**
    * A function that transforms a plugin object before it is consumed by the
    * setting registry.
    */
  type Transform = js.Function1[
    /* plugin */ typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin, 
    typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
  ]
}
