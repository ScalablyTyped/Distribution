package typings.k6.htmlMod

import typings.k6.htmlMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def parseHTML(html: String): Selection = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(html.asInstanceOf[js.Any]).asInstanceOf[Selection]

type Handler = js.Function2[/* index */ Double, /* element */ Element, Unit]

type Mapper = js.Function2[/* index */ Double, /* selection */ Selection, Any]

type Tester = js.Function2[/* index */ Double, /* element */ Element, Boolean]
