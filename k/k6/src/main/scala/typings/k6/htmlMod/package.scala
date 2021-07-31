package typings.k6.htmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def parseHTML(html: java.lang.String): typings.k6.htmlMod.Selection = typings.k6.htmlMod.^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(html.asInstanceOf[js.Any]).asInstanceOf[typings.k6.htmlMod.Selection]

type Handler = js.Function2[/* index */ scala.Double, /* element */ typings.k6.htmlMod.Element, scala.Unit]

type Mapper = js.Function2[/* index */ scala.Double, /* element */ typings.k6.htmlMod.Element, js.Any]

type Tester = js.Function2[/* index */ scala.Double, /* element */ typings.k6.htmlMod.Element, scala.Boolean]
