package typings.jupyterlabServices.sessionSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ISessionConnection {
  /**
    * An arguments object for the kernel changed signal.
    */
  type IKernelChangedArgs = typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[
    typings.jupyterlabServices.kernelKernelMod.IKernelConnection | scala.Null, 
    typings.jupyterlabServices.kernelKernelMod.IKernelConnection | scala.Null, 
    typings.jupyterlabServices.jupyterlabServicesStrings.kernel
  ]
}
