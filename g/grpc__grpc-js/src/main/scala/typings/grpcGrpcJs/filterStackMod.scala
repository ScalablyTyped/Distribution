package typings.grpcGrpcJs

import typings.grpcGrpcJs.filterMod.Filter
import typings.grpcGrpcJs.filterMod.FilterFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterStackMod {
  
  @JSImport("@grpc/grpc-js/build/src/filter-stack", "FilterStack")
  @js.native
  class FilterStack protected () extends Filter {
    def this(filters: js.Array[Filter]) = this()
    
    val filters: js.Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/filter-stack", "FilterStackFactory")
  @js.native
  class FilterStackFactory protected () extends FilterFactory[FilterStack] {
    def this(factories: js.Array[FilterFactory[Filter]]) = this()
    
    val factories: js.Any = js.native
  }
}
