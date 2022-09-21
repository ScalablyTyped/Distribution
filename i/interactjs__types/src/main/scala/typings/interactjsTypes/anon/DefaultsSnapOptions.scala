package typings.interactjsTypes.anon

import typings.interactjsTypes.interactjsModifiersTypesMod.Modifier
import typings.interactjsTypes.interactjsTypesStrings.snap
import typings.interactjsTypes.snapPointerMod.SnapOptions
import typings.interactjsTypes.snapPointerMod.SnapState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultsSnapOptions extends StObject {
  
  def apply(): Modifier[SnapOptions, SnapState, snap, Delta] = js.native
  def apply(_options: PartialSnapOptions): Modifier[SnapOptions, SnapState, snap, Delta] = js.native
  
  var _defaults: SnapOptions = js.native
  
  var _methods: SetStart = js.native
}
