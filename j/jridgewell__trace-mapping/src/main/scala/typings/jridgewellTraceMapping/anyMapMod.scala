package typings.jridgewellTraceMapping

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.jridgewellTraceMapping.mod.TraceMap
import typings.jridgewellTraceMapping.typesMod.SectionedSourceMapInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anyMapMod {
  
  @js.native
  trait AnyMap
    extends StObject
       with Instantiable1[/* map */ SectionedSourceMapInput, TraceMap]
       with Instantiable2[/* map */ SectionedSourceMapInput, /* mapUrl */ String, TraceMap] {
    
    def apply(map: SectionedSourceMapInput): TraceMap = js.native
    def apply(map: SectionedSourceMapInput, mapUrl: String): TraceMap = js.native
  }
  @JSImport("@jridgewell/trace-mapping/dist/types/any-map", "AnyMap")
  @js.native
  val AnyMap: typings.jridgewellTraceMapping.anyMapMod.AnyMap = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@jridgewell/trace-mapping/dist/types/any-map", "AnyMap")
  @js.native
  open class AnyMapCls protected () extends TraceMap {
    def this(map: SectionedSourceMapInput) = this()
    def this(map: SectionedSourceMapInput, mapUrl: String) = this()
  }
}
