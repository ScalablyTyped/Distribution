package typings
package javascriptDashStateDashMachineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_CANCELLED extends js.Object {
  	    // = 2, the event was successfull but no state transition was necessary
  var CANCELLED: scala.Double
  	        // = 1, the event transitioned successfully from one state to another
  var NOTRANSITION: scala.Double
  	        // = 3, the event was cancelled by the caller in a beforeEvent callback
  var PENDING: scala.Double
  var SUCCEEDED: scala.Double
}

