package typings.inversifyInjectDecorators

import typings.inversify.interfacesMod.interfaces.Abstract
import typings.inversify.interfacesMod.interfaces.Newable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLazyInject extends js.Object {
  def lazyInject(serviceIdentifier: String): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
  def lazyInject(serviceIdentifier: js.Symbol): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
  def lazyInject(serviceIdentifier: Abstract[_]): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
  def lazyInject(serviceIdentifier: Newable[_]): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
  def lazyInjectNamed(serviceIdentifier: String, named: String): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
  def lazyInjectNamed(serviceIdentifier: js.Symbol, named: String): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
  def lazyInjectNamed(serviceIdentifier: Abstract[_], named: String): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
  def lazyInjectNamed(serviceIdentifier: Newable[_], named: String): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
  def lazyInjectTagged(serviceIdentifier: String, key: String, value: js.Any): js.Function2[/* proto */ js.Any, /* propertyName */ String, Unit] = js.native
  def lazyInjectTagged(serviceIdentifier: js.Symbol, key: String, value: js.Any): js.Function2[/* proto */ js.Any, /* propertyName */ String, Unit] = js.native
  def lazyInjectTagged(serviceIdentifier: Abstract[_], key: String, value: js.Any): js.Function2[/* proto */ js.Any, /* propertyName */ String, Unit] = js.native
  def lazyInjectTagged(serviceIdentifier: Newable[_], key: String, value: js.Any): js.Function2[/* proto */ js.Any, /* propertyName */ String, Unit] = js.native
  def lazyMultiInject(serviceIdentifier: String): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
  def lazyMultiInject(serviceIdentifier: js.Symbol): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
  def lazyMultiInject(serviceIdentifier: Abstract[_]): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
  def lazyMultiInject(serviceIdentifier: Newable[_]): js.Function2[/* proto */ js.Any, /* key */ String, Unit] = js.native
}

