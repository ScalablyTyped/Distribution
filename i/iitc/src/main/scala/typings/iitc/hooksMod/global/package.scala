package typings.iitc.hooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object global {
  
  type EventPaneChanged = java.lang.String
  
  type EventSearch = js.Any
  
  type HookCallback = js.Function1[/* data */ js.Any, scala.Boolean | scala.Unit]
  
  type PortalDetailEnt = js.Tuple3[
    /*guid*/ java.lang.String, 
    /*dict.timestamp*/ scala.Double, 
    /*data.result*/ typings.iitc.inteltypesMod.Intel.PortalDetails
  ]
}
