package typings.itemsjs

import typings.itemsjs.mod.Order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemsjsStrings {
  
  @js.native
  sealed trait asc
    extends StObject
       with Order
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait count extends StObject
  inline def count: count = "count".asInstanceOf[count]
  
  @js.native
  sealed trait desc
    extends StObject
       with Order
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait term extends StObject
  inline def term: term = "term".asInstanceOf[term]
}
