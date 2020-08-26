package typings.ledgerhqHwTransport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ledgerhq/hw-transport", JSImport.Default)
@js.native
class default[TDescriptor /* <: Descriptor */] () extends Transport[TDescriptor]

/* static members */
@JSImport("@ledgerhq/hw-transport", JSImport.Default)
@js.native
object default extends js.Object {
  def create(): js.Promise[Transport[Descriptor]] = js.native
  def create(openTimeout: js.UndefOr[scala.Nothing], listenTimeout: Double): js.Promise[Transport[Descriptor]] = js.native
  def create(openTimeout: Double): js.Promise[Transport[Descriptor]] = js.native
  def create(openTimeout: Double, listenTimeout: Double): js.Promise[Transport[Descriptor]] = js.native
  def isSupported(): js.Promise[Boolean] = js.native
  def list(): js.Promise[js.Array[Descriptor]] = js.native
  def listen(observer: Observer[DescriptorEvent[Descriptor]]): Subscription = js.native
  def open(descriptor: Descriptor): js.Promise[
    Transport[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof descriptor */ _
    ]
  ] = js.native
  def open(descriptor: Descriptor, timeout: Double): js.Promise[
    Transport[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof descriptor */ _
    ]
  ] = js.native
}

