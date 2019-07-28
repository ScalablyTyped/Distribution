package typings.jqueryDashSortable

import typings.jqueryDashSortable.JQuery
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQuerySortableNs {
  type Dimensions = js.Array[Double]
  type GenericEventHandler = js.Function4[
    /* $item */ js.UndefOr[JQuery], 
    /* container */ js.UndefOr[Container], 
    /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.GenericEventHandler */ js.Object
    ], 
    /* event */ js.UndefOr[Event], 
    Unit
  ]
  type OnCancelHandler = js.Function4[
    /* $item */ js.UndefOr[JQuery], 
    /* container */ js.UndefOr[Container], 
    /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnCancelHandler */ js.Object
    ], 
    /* event */ js.UndefOr[Event], 
    Unit
  ]
  type OnDragEventHandler = js.Function4[
    /* $item */ js.UndefOr[JQuery], 
    /* position */ js.UndefOr[Position], 
    /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnDragEventHandler */ js.Object
    ], 
    /* event */ js.UndefOr[Event], 
    Unit
  ]
  type OnMousedownHandler = js.Function3[
    /* $item */ js.UndefOr[JQuery], 
    /* _super */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias jquery-sortable.JQuerySortable.OnMousedownHandler */ js.Object
    ], 
    /* event */ js.UndefOr[Event], 
    Unit
  ]
  // Deliberately typing $children as an any here as it makes it much easier to use. Actual type is JQuery | any[]
  type SerializeFunc = js.Function3[/* $parent */ JQuery, /* $children */ js.Any, /* parentIsContainer */ Boolean, Unit]
}
