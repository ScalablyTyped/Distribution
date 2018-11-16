package typings
package jqueryDashSortableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQuerySortableNs {
  type Dimensions = js.Array[scala.Double]
  type GenericEventHandler = js.Function4[
    /* $item */ js.UndefOr[jqueryDashSortableLib.JQuery], 
    /* container */ js.UndefOr[Container], 
    /* _super */ js.UndefOr[js.Object], 
    /* event */ js.UndefOr[stdLib.Event], 
    scala.Unit
  ]
  type OnCancelHandler = js.Function4[
    /* $item */ js.UndefOr[jqueryDashSortableLib.JQuery], 
    /* container */ js.UndefOr[Container], 
    /* _super */ js.UndefOr[js.Object], 
    /* event */ js.UndefOr[stdLib.Event], 
    scala.Unit
  ]
  type OnDragEventHandler = js.Function4[
    /* $item */ js.UndefOr[jqueryDashSortableLib.JQuery], 
    /* position */ js.UndefOr[Position], 
    /* _super */ js.UndefOr[js.Object], 
    /* event */ js.UndefOr[stdLib.Event], 
    scala.Unit
  ]
  type OnMousedownHandler = js.Function3[
    /* $item */ js.UndefOr[jqueryDashSortableLib.JQuery], 
    /* _super */ js.UndefOr[js.Object], 
    /* event */ js.UndefOr[stdLib.Event], 
    scala.Unit
  ]
  // Deliberately typing $children as an any here as it makes it much easier to use. Actual type is JQuery | any[]
  type SerializeFunc = js.Function3[
    /* $parent */ jqueryDashSortableLib.JQuery, 
    /* $children */ js.Any, 
    /* parentIsContainer */ scala.Boolean, 
    scala.Unit
  ]
}
