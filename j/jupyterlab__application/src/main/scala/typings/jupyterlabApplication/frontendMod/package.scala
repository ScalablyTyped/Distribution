package typings.jupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object frontendMod {
  type JupyterFrontEnd[T /* <: typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell */] = typings.jupyterlabApplication.frontendMod.JupyterFrontEnd_[T]
  type JupyterFrontEndPlugin[T] = typings.luminoApplication.mod.IPlugin[
    typings.jupyterlabApplication.frontendMod.JupyterFrontEnd[typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell], 
    T
  ]
}
