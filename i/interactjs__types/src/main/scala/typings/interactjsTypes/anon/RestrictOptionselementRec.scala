package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.RectResolvable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @interactjs/types.@interactjs/modifiers/restrict/pointer.RestrictOptions & {  elementRect :{  top :number,   left :number,   bottom :number,   right :number}} */
trait RestrictOptionselementRec extends StObject {
  
  var elementRect: typings.interactjsTypes.coreTypesMod.Rect & Right
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var endOnly: Boolean
  
  var offset: typings.interactjsTypes.coreTypesMod.Rect
  
  var restriction: RectResolvable[
    js.Tuple3[Double, Double, typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]]
  ]
}
object RestrictOptionselementRec {
  
  inline def apply(
    elementRect: typings.interactjsTypes.coreTypesMod.Rect & Right,
    endOnly: Boolean,
    offset: typings.interactjsTypes.coreTypesMod.Rect,
    restriction: RectResolvable[
      js.Tuple3[Double, Double, typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]]
    ]
  ): RestrictOptionselementRec = {
    val __obj = js.Dynamic.literal(elementRect = elementRect.asInstanceOf[js.Any], endOnly = endOnly.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], restriction = restriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictOptionselementRec]
  }
  
  extension [Self <: RestrictOptionselementRec](x: Self) {
    
    inline def setElementRect(value: typings.interactjsTypes.coreTypesMod.Rect & Right): Self = StObject.set(x, "elementRect", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEndOnly(value: Boolean): Self = StObject.set(x, "endOnly", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: typings.interactjsTypes.coreTypesMod.Rect): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setRestriction(
      value: RectResolvable[
          js.Tuple3[Double, Double, typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]]
        ]
    ): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
    
    inline def setRestrictionFunction1(
      value: js.Tuple3[Double, Double, typings.interactjsTypes.coreInteractionMod.Interaction[ActionName]] => typings.interactjsTypes.coreTypesMod.Rect | typings.interactjsTypes.coreTypesMod.Element
    ): Self = StObject.set(x, "restriction", js.Any.fromFunction1(value))
  }
}
