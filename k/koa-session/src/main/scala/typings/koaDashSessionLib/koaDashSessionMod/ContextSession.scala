package typings
package koaDashSessionLib.koaDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextSession extends js.Object {
  var app: /* import warning: ImportType.apply Failed type conversion: koa-session.koa-session.koa.Context['app'] */ js.Any
  var ctx: koaDashSessionLib.koaDashSessionMod.koaMod.Context
  var opts: koaDashSessionLib.koaDashSessionMod.opts
  var prevHash: java.lang.String
  var session: Session | koaDashSessionLib.koaDashSessionLibNumbers.`false`
  var store: stores
  /**
    * Commit the session changes or removal.
    */
  def commit(): js.Promise[scala.Unit]
  /**
    * internal logic of `ctx.session`
    */
  def get(): Session
  /**
    * init session from external store
    * will be called in the front of session middleware
    */
  def initFromExternal(): js.Promise[scala.Unit]
  /**
    * internal logic of `ctx.session=`
    */
  def set(`val`: js.Any): scala.Unit
}

object ContextSession {
  @scala.inline
  def apply(
    app: /* import warning: ImportType.apply Failed type conversion: koa-session.koa-session.koa.Context['app'] */ js.Any,
    commit: () => js.Promise[scala.Unit],
    ctx: koaDashSessionLib.koaDashSessionMod.koaMod.Context,
    get: () => Session,
    initFromExternal: () => js.Promise[scala.Unit],
    opts: opts,
    prevHash: java.lang.String,
    session: Session | koaDashSessionLib.koaDashSessionLibNumbers.`false`,
    set: js.Any => scala.Unit,
    store: stores
  ): ContextSession = {
    val __obj = js.Dynamic.literal(app = app, commit = js.Any.fromFunction0(commit), ctx = ctx, get = js.Any.fromFunction0(get), initFromExternal = js.Any.fromFunction0(initFromExternal), opts = opts, prevHash = prevHash, session = session.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), store = store)
  
    __obj.asInstanceOf[ContextSession]
  }
}

