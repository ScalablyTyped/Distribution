package typings.iitc.inteltypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Intel {
  
  type ChatLine = js.Tuple3[
    /*guid*/ java.lang.String, 
    /*time*/ scala.Double, 
    typings.iitc.inteltypesMod.Intel.PlextContainer
  ]
  
  type FieldDetails = js.Array[js.Any]
  
  type LinkDetails = js.Array[js.Any]
  
  type MarkUpPlayer = js.Tuple2[typings.iitc.iitcStrings.PLAYER, typings.iitc.inteltypesMod.Intel.MarkUpPlayerType]
  
  type MarkUpPortal = js.Tuple2[typings.iitc.iitcStrings.PORTAL, typings.iitc.inteltypesMod.Intel.MarkUpPortalType]
  
  type MarkUpText = js.Tuple2[typings.iitc.iitcStrings.TEXT, typings.iitc.inteltypesMod.Intel.MarkUpTextType]
  
  // ENTITY
  type PortalDetails = js.Array[js.Any]
}
