package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supported environment names to run Google Pay.
  *
  * Options:
  *
  * - `PRODUCTION`:
  *   Used to return chargeable payment methods when a valid Google
  *   merchant ID is specified and configured for the domain.
  *
  * - `TEST`:
  *   Dummy payment methods that are suitable for testing (default).
  */
/* Rewritten from type alias, can be one of: 
  - typings.googlepay.googlepayStrings.PRODUCTION
  - typings.googlepay.googlepayStrings.TEST
*/
trait Environment extends StObject
object Environment {
  
  inline def PRODUCTION: typings.googlepay.googlepayStrings.PRODUCTION = "PRODUCTION".asInstanceOf[typings.googlepay.googlepayStrings.PRODUCTION]
  
  inline def TEST: typings.googlepay.googlepayStrings.TEST = "TEST".asInstanceOf[typings.googlepay.googlepayStrings.TEST]
}
