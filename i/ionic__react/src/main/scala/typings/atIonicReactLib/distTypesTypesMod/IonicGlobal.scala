package typings
package atIonicReactLib.distTypesTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicGlobal extends js.Object {
  var ael: js.UndefOr[
    js.Function4[
      /* elm */ js.Any, 
      /* eventName */ java.lang.String, 
      /* cb */ js.Function1[/* ev */ stdLib.Event, scala.Unit], 
      /* opts */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var config: js.UndefOr[js.Any] = js.undefined
  var raf: js.UndefOr[js.Function1[/* ts */ scala.Double, scala.Unit]] = js.undefined
  var rel: js.UndefOr[
    js.Function4[
      /* elm */ js.Any, 
      /* eventName */ java.lang.String, 
      /* cb */ js.Function1[/* ev */ stdLib.Event, scala.Unit], 
      /* opts */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
}

object IonicGlobal {
  @scala.inline
  def apply(
    ael: (/* elm */ js.Any, /* eventName */ java.lang.String, /* cb */ js.Function1[/* ev */ stdLib.Event, scala.Unit], /* opts */ js.Any) => scala.Unit = null,
    config: js.Any = null,
    raf: /* ts */ scala.Double => scala.Unit = null,
    rel: (/* elm */ js.Any, /* eventName */ java.lang.String, /* cb */ js.Function1[/* ev */ stdLib.Event, scala.Unit], /* opts */ js.Any) => scala.Unit = null
  ): IonicGlobal = {
    val __obj = js.Dynamic.literal()
    if (ael != null) __obj.updateDynamic("ael")(js.Any.fromFunction4(ael))
    if (config != null) __obj.updateDynamic("config")(config)
    if (raf != null) __obj.updateDynamic("raf")(js.Any.fromFunction1(raf))
    if (rel != null) __obj.updateDynamic("rel")(js.Any.fromFunction4(rel))
    __obj.asInstanceOf[IonicGlobal]
  }
}

