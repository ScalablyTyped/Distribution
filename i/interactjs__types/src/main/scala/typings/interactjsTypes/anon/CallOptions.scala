package typings.interactjsTypes.anon

import typings.interactjsTypes.edgesMod.RestrictEdgesState
import typings.interactjsTypes.interactjsModifiersTypesMod.Modifier
import typings.interactjsTypes.interactjsTypesStrings.restrictSize
import typings.interactjsTypes.sizeMod.RestrictSizeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallOptions extends StObject {
  
  def apply(): Modifier[RestrictSizeOptions, RestrictEdgesState, restrictSize, Unit] = js.native
  def apply(_options: PartialRestrictSizeOption): Modifier[RestrictSizeOptions, RestrictEdgesState, restrictSize, Unit] = js.native
  
  var _defaults: RestrictSizeOptions = js.native
  
  var _methods: SetStartStop = js.native
}
