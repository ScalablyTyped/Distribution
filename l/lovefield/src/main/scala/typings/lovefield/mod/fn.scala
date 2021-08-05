package typings.lovefield.mod

import typings.lovefield.mod.schema.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// module op
object fn {
  
  @JSImport("lovefield", "fn")
  @js.native
  val ^ : js.Any = js.native
  
  inline def avg(column: Column): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("avg")(column.asInstanceOf[js.Any]).asInstanceOf[Column]
  
  inline def count(): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[Column]
  inline def count(column: Column): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(column.asInstanceOf[js.Any]).asInstanceOf[Column]
  
  inline def distinct(column: Column): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("distinct")(column.asInstanceOf[js.Any]).asInstanceOf[Column]
  
  inline def geomean(column: Column): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("geomean")(column.asInstanceOf[js.Any]).asInstanceOf[Column]
  
  inline def max(column: Column): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(column.asInstanceOf[js.Any]).asInstanceOf[Column]
  
  inline def min(column: Column): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(column.asInstanceOf[js.Any]).asInstanceOf[Column]
  
  inline def stddev(column: Column): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("stddev")(column.asInstanceOf[js.Any]).asInstanceOf[Column]
  
  inline def sum(column: Column): Column = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(column.asInstanceOf[js.Any]).asInstanceOf[Column]
}
