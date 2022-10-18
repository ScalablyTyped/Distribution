package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsTypesStrings.snapSize
import typings.interactjsTypes.modifiersSnapPointerMod.SnapState
import typings.interactjsTypes.modifiersSnapSizeMod.SnapSizeOptions
import typings.interactjsTypes.modifiersTypesMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultsSnapSizeOptions extends StObject {
  
  def apply(): Modifier[SnapSizeOptions, SnapState, snapSize, Delta] = js.native
  def apply(_options: PartialSnapSizeOptions): Modifier[SnapSizeOptions, SnapState, snapSize, Delta] = js.native
  
  var _defaults: SnapSizeOptions = js.native
  
  var _methods: SetStart = js.native
}
