package typings.jsxPdf.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object JSX {
  
  type Child = typings.jsxPdf.mod.global.JSX.Element | js.Array[typings.jsxPdf.mod.global.JSX.Element]
  
  type DynamicChild = typings.jsxPdf.mod.global.JSX.Child | (js.Function3[
    /* currentPage */ scala.Double, 
    /* pageCount */ scala.Double, 
    /* pageSize */ typings.pdfmake.interfacesMod.ContextPageSize, 
    typings.jsxPdf.mod.global.JSX.Child
  ])
  
  type Ele[Props] = typings.jsxPdf.mod.global.JSX.ElementChildrenAttribute with Props
  
  type EleNoChidlren[Props] = Props
}
