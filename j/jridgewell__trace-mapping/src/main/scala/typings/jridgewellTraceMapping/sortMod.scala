package typings.jridgewellTraceMapping

import typings.jridgewellTraceMapping.sourcemapSegmentMod.SourceMapSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortMod {
  
  @JSImport("@jridgewell/trace-mapping/dist/types/sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(mappings: js.Array[js.Array[SourceMapSegment]], owned: Boolean): js.Array[js.Array[SourceMapSegment]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mappings.asInstanceOf[js.Any], owned.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[SourceMapSegment]]]
}
