package typings.koaDashSession.koaDashSessionMod

import typings.koaDashSession.koaDashSessionMod.koaMod.Context
import typings.koaDashSession.koaDashSessionNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextSession extends js.Object {
  var app: /* import warning: ImportType.apply Failed type conversion: koa-session.koa-session.koa.Context['app'] */ js.Any
  var ctx: Context
  var opts: typings.koaDashSession.koaDashSessionMod.opts
  var prevHash: String
  var session: Session | `false`
  var store: stores
  /**
    * Commit the session changes or removal.
    */
  def commit(): js.Promise[Unit]
  /**
    * internal logic of `ctx.session`
    */
  def get(): Session
  /**
    * init session from external store
    * will be called in the front of session middleware
    */
  def initFromExternal(): js.Promise[Unit]
  /**
    * internal logic of `ctx.session=`
    */
  def set(`val`: js.Any): Unit
}

object ContextSession {
  @scala.inline
  def apply(
    app: /* import warning: ImportType.apply Failed type conversion: koa-session.koa-session.koa.Context['app'] */ js.Any,
    commit: () => js.Promise[Unit],
    ctx: Context,
    get: () => Session,
    initFromExternal: () => js.Promise[Unit],
    opts: opts,
    prevHash: String,
    session: Session | `false`,
    set: js.Any => Unit,
    store: stores
  ): ContextSession = {
    val __obj = js.Dynamic.literal(app = app, commit = js.Any.fromFunction0(commit), ctx = ctx, get = js.Any.fromFunction0(get), initFromExternal = js.Any.fromFunction0(initFromExternal), opts = opts, prevHash = prevHash, session = session.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), store = store)
  
    __obj.asInstanceOf[ContextSession]
  }
}

