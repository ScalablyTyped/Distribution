package typings.jimpCompact

import org.scalablytyped.runtime.Shortcut
import typings.jimpCompact.anon.Decoders
import typings.jimpCore.jimpMod.JimpConstructors
import typings.jimpCore.utilsMod.GetPluginConst
import typings.jimpCore.utilsMod.GetPluginDecoders
import typings.jimpCore.utilsMod.GetPluginEncoders
import typings.jimpCore.utilsMod.GetPluginVal
import typings.jimpCore.utilsMod.UnionToIntersection
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jimp-compact", JSImport.Default)
  @js.native
  val default: JimpConstructors & IntersectedPluginConsts & Decoders = js.native
  
  type IntersectedPluginConsts = UnionToIntersection[GetPluginConst[Plugins | Types]]
  
  type IntersectedPluginDecoders = UnionToIntersection[GetPluginDecoders[Plugins | Types]]
  
  type IntersectedPluginEncoders = UnionToIntersection[GetPluginEncoders[Plugins | Types]]
  
  type IntersectedPluginTypes = UnionToIntersection[GetPluginVal[Plugins | Types]]
  
  type Jimp = typings.jimpCore.jimpMod.Jimp & IntersectedPluginTypes
  
  type Plugins = ReturnType[js.Function0[typings.jimpPlugins.mod.Plugins]]
  
  type Types = ReturnType[js.Function0[typings.jimpTypes.mod.Types]]
  
  type _To = JimpConstructors & IntersectedPluginConsts & Decoders
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JimpConstructors & IntersectedPluginConsts & Decoders = default
}
