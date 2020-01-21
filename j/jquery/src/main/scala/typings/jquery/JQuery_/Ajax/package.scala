package typings.jquery.JQuery_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Ajax {
  type CompleteCallback[TContext] = js.ThisFunction2[
    /* this */ TContext, 
    /* jqXHR */ typings.jquery.JQuery_.jqXHR[js.Any], 
    /* textStatus */ typings.jquery.JQuery_.Ajax.TextStatus, 
    scala.Unit
  ]
  type ErrorCallback[TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* jqXHR */ typings.jquery.JQuery_.jqXHR[js.Any], 
    /* textStatus */ typings.jquery.JQuery_.Ajax.ErrorTextStatus, 
    /* errorThrown */ java.lang.String, 
    scala.Unit
  ]
  type SuccessCallback[TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* data */ js.Any, 
    /* textStatus */ typings.jquery.JQuery_.Ajax.SuccessTextStatus, 
    /* jqXHR */ typings.jquery.JQuery_.jqXHR[js.Any], 
    scala.Unit
  ]
}
