package typings.iabVpaid.iab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vpaid {
  /** Vpaid events and associated callbacks to type `subscribe` and `unsubscribe` methods */
  type EventsMap = typings.iabVpaid.iab.vpaid.SimpleEventsMap with typings.iabVpaid.iab.vpaid.ParameterizedEventsMap
  type EventsNames = java.lang.String
  type SimpleEventsMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in iab-vpaid.iab.vpaid.SimpleEvents ]: (): void}
    */ typings.iabVpaid.iabVpaidStrings.SimpleEventsMap with js.Any
}
