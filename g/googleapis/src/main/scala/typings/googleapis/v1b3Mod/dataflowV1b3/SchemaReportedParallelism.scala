package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the level of parallelism in a WorkItem&#39;s input, reported by
  * the worker.
  */
trait SchemaReportedParallelism extends StObject {
  
  /**
    * Specifies whether the parallelism is infinite. If true, &quot;value&quot;
    * is ignored. Infinite parallelism means the service will assume that the
    * work item can always be split into more non-empty work items by dynamic
    * splitting. This is a work-around for lack of support for infinity by the
    * current JSON-based Java RPC stack.
    */
  var isInfinite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the level of parallelism in case it is finite.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object SchemaReportedParallelism {
  
  inline def apply(): SchemaReportedParallelism = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportedParallelism]
  }
  
  extension [Self <: SchemaReportedParallelism](x: Self) {
    
    inline def setIsInfinite(value: Boolean): Self = StObject.set(x, "isInfinite", value.asInstanceOf[js.Any])
    
    inline def setIsInfiniteUndefined: Self = StObject.set(x, "isInfinite", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
