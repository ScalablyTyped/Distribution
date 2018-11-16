package typings
package graphqlDashSubscriptionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distWithDashFilterMod {
  type FilterFn = js.Function4[
    /* rootValue */ js.UndefOr[js.Any], 
    /* args */ js.UndefOr[js.Any], 
    /* context */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[js.Any], 
    scala.Boolean | stdLib.Promise[scala.Boolean]
  ]
  type ResolverFn = js.Function4[
    /* rootValue */ js.UndefOr[js.Any], 
    /* args */ js.UndefOr[js.Any], 
    /* context */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[js.Any], 
    stdLib.AsyncIterator[js.Any]
  ]
}
