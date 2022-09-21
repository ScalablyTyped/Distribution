package typings.interactjsTypes.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.interactjsTypes.anon.RecordActionNamekeyofInte
import typings.interactjsTypes.interactEventMod.PhaseMap
import typings.interactjsTypes.interactjsTypesBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  var map: ActionMap
  
  var methodDict: RecordActionNamekeyofInte
  
  var phaselessTypes: StringDictionary[`true`]
  
  var phases: PhaseMap
}
object Actions {
  
  inline def apply(
    map: ActionMap,
    methodDict: RecordActionNamekeyofInte,
    phaselessTypes: StringDictionary[`true`],
    phases: PhaseMap
  ): Actions = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], methodDict = methodDict.asInstanceOf[js.Any], phaselessTypes = phaselessTypes.asInstanceOf[js.Any], phases = phases.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions]
  }
  
  extension [Self <: Actions](x: Self) {
    
    inline def setMap(value: ActionMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMethodDict(value: RecordActionNamekeyofInte): Self = StObject.set(x, "methodDict", value.asInstanceOf[js.Any])
    
    inline def setPhaselessTypes(value: StringDictionary[`true`]): Self = StObject.set(x, "phaselessTypes", value.asInstanceOf[js.Any])
    
    inline def setPhases(value: PhaseMap): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
  }
}
