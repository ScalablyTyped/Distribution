package typings.labeledDashStreamDashSplicer

import typings.labeledDashStreamDashSplicer.labeledDashStreamDashSplicerMod.Index
import typings.labeledDashStreamDashSplicer.labeledDashStreamDashSplicerMod.LabeledStreamList
import typings.labeledDashStreamDashSplicer.labeledDashStreamDashSplicerMod.Stream
import typings.labeledDashStreamDashSplicer.labeledDashStreamDashSplicerMod.splicer
import typings.node.NodeJS.ReadWriteStream
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("labeled-stream-splicer", JSImport.Namespace)
@js.native
object labeledDashStreamDashSplicerMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof node.stream.Duplex, 'push' | 'unshift'> ]: node.stream.Duplex[P]} */ @js.native
  trait splicer extends js.Object {
    val length: Double = js.native
    def get(index: Index): js.UndefOr[Stream] = js.native
    def indexOf(labelOrStream: String): Double = js.native
    def indexOf(labelOrStream: Stream): Double = js.native
    def pop(): js.UndefOr[Stream] = js.native
    def push(
      /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param stream because its type ReadonlyArray<Stream> is not an array type */ stream: js.Array[Stream]
    ): Double = js.native
    def shift(): js.UndefOr[Stream] = js.native
    def splice(
      index: Index,
      howMany: Double,
      /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param stream because its type ReadonlyArray<Stream> is not an array type */ stream: js.Array[Stream]
    ): js.Array[Stream] = js.native
    def unshift(
      /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param stream because its type ReadonlyArray<Stream> is not an array type */ stream: js.Array[Stream]
    ): Double = js.native
  }
  
  def apply(): splicer = js.native
  def apply(streams: LabeledStreamList): splicer = js.native
  def apply(streams: LabeledStreamList, opts: TransformOptions): splicer = js.native
  def obj(): splicer = js.native
  def obj(streams: LabeledStreamList): splicer = js.native
  def obj(streams: LabeledStreamList, opts: TransformOptions): splicer = js.native
  type Index = Double | String
  type LabeledStreamList = js.Array[String | Stream | js.Array[Stream]]
  type Stream = ReadableStream | WritableStream | ReadWriteStream
}

