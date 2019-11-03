package typings.iabDashVpaid.iab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vpaid {
  /** Vpaid events and associated callbacks to type `subscribe` and `unsubscribe` methods */
  type EventsMap = SimpleEventsMap with ParameterizedEventsMap
  type EventsNames = String
  type SimpleEventsMap = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in iab-vpaid.iab.vpaid.SimpleEvents ]: (): void}
    */ typings.iabDashVpaid.iabDashVpaidStrings.SimpleEventsMap with js.Any
}
