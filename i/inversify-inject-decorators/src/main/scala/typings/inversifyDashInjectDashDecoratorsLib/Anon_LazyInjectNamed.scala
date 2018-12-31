package typings
package inversifyDashInjectDashDecoratorsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LazyInjectNamed extends js.Object {
  var lazyInject: js.Function1[
    /* serviceIdentifier */ java.lang.String | js.Symbol | (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify interfaces.Newable<any> */ js.Any), 
    js.Function2[/* proto */ _, /* key */ java.lang.String, scala.Unit]
  ]
  var lazyInjectNamed: js.Function2[
    /* serviceIdentifier */ java.lang.String | js.Symbol | (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify interfaces.Newable<any> */ js.Any), 
    /* named */ java.lang.String, 
    js.Function2[/* proto */ _, /* key */ java.lang.String, scala.Unit]
  ]
  var lazyInjectTagged: js.Function3[
    /* serviceIdentifier */ java.lang.String | js.Symbol | (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify interfaces.Newable<any> */ js.Any), 
    /* key */ java.lang.String, 
    /* value */ js.Any, 
    js.Function2[/* proto */ _, /* propertyName */ java.lang.String, scala.Unit]
  ]
  var lazyMultiInject: js.Function1[
    /* serviceIdentifier */ java.lang.String | js.Symbol | (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify interfaces.Newable<any> */ js.Any), 
    js.Function2[/* proto */ _, /* key */ java.lang.String, scala.Unit]
  ]
}

