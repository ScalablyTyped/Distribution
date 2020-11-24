package typings.jsnox.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * JSnoX requires an object with a createElement method.
  * This will normally be the React object but could be something else
  */
@js.native
trait ReactLikeObject extends js.Object {
  
  def createElement[P](`type`: String, props: P, children: ReactNode): ReactElement = js.native
  def createElement[P](`type`: ComponentClass[P, ComponentState], props: P, children: ReactNode): ReactElement = js.native
}
