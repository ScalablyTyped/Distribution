package typings.jimpCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object pluginsMod {
  
  type ClassOrConstantPlugin[T /* <: typings.jimpCore.etcMod.Image */] = typings.jimpCore.pluginsMod.WellFormedPlugin[T] with (typings.std.Required[
    typings.std.Pick[
      typings.jimpCore.pluginsMod.WellFormedPlugin[T], 
      typings.jimpCore.jimpCoreStrings.`class` | typings.jimpCore.jimpCoreStrings.constants
    ]
  ])
  
  type IllformedPlugin = (typings.jimpCore.utilsMod.Omit[
    _, 
    typings.jimpCore.jimpCoreStrings.`class` | typings.jimpCore.jimpCoreStrings.constants
  ]) with typings.jimpCore.anon.Class
  
  type JimpPlugin[T /* <: typings.jimpCore.etcMod.Image */] = typings.jimpCore.pluginsMod.ClassOrConstantPlugin[T] | typings.jimpCore.pluginsMod.IllformedPlugin
}
