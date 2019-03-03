package typings
package kapellmeisterLib.kapellmeisterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config
  extends /* key */ org.scalablytyped.runtime.StringDictionary[
      js.Array[scala.Double] | js.Array[java.lang.String] | scala.Double | java.lang.String | CustomInterpolator | NameSpace | Timing
    ] {
  var events: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Eventable */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Eventable */ js.Any
  ] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[
      js.Array[scala.Double] | js.Array[java.lang.String] | scala.Double | java.lang.String | CustomInterpolator | NameSpace | Timing
    ] = null,
    events: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Eventable */ js.Any = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[Config]
  }
}

