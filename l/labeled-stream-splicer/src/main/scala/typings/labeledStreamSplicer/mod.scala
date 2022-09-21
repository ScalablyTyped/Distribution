package typings.labeledStreamSplicer

import typings.node.streamMod.TransformOptions
import typings.std.ReadableStream
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): splicer = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[splicer]
  inline def apply(streams: Unit, opts: TransformOptions): splicer = (^.asInstanceOf[js.Dynamic].apply(streams.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[splicer]
  inline def apply(streams: LabeledStreamList): splicer = ^.asInstanceOf[js.Dynamic].apply(streams.asInstanceOf[js.Any]).asInstanceOf[splicer]
  inline def apply(streams: LabeledStreamList, opts: TransformOptions): splicer = (^.asInstanceOf[js.Dynamic].apply(streams.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[splicer]
  
  @JSImport("labeled-stream-splicer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def obj(): splicer = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")().asInstanceOf[splicer]
  inline def obj(streams: Unit, opts: TransformOptions): splicer = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(streams.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[splicer]
  inline def obj(streams: LabeledStreamList): splicer = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(streams.asInstanceOf[js.Any]).asInstanceOf[splicer]
  inline def obj(streams: LabeledStreamList, opts: TransformOptions): splicer = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(streams.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[splicer]
  
  type Index = Double | String
  
  type LabeledStreamList = js.Array[String | Stream | js.Array[Stream]]
  
  type Stream = ReadableStream[Any] | WritableStream[Any] | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream */ Any)
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof node.stream.Duplex, 'push' | 'unshift'> ]: node.stream.Duplex[P]} */ @js.native
  trait splicer extends StObject {
    
    def get(index: Index): js.UndefOr[Stream] = js.native
    
    def indexOf(labelOrStream: String): Double = js.native
    def indexOf(labelOrStream: Stream): Double = js.native
    
    val length: Double = js.native
    
    def pop(): js.UndefOr[Stream] = js.native
    
    def push(stream: Stream*): Double = js.native
    
    def shift(): js.UndefOr[Stream] = js.native
    
    def splice(index: Index, howMany: Double, stream: Stream*): js.Array[Stream] = js.native
    
    def unshift(stream: Stream*): Double = js.native
  }
}
