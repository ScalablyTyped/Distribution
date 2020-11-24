package typings.ipfsCore

import typings.ipfsCore.anon.Node
import typings.ipfsCore.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ipfs-core/dist/src/components/files/utils/hamt-utils", JSImport.Namespace)
@js.native
object hamtUtilsMod extends js.Object {
  
  def addLinksToHamtBucket(links: js.Any, bucket: js.Any, rootBucket: js.Any): js.Promise[Unit] = js.native
  
  def createShard(context: js.Any, contents: js.Any, options: js.Any): js.Promise[_] = js.native
  
  def generatePath(context: js.Any, fileName: js.Any, rootNode: js.Any): js.Promise[Path] = js.native
  
  def recreateHamtLevel(links: js.Any, rootBucket: js.Any, parentBucket: js.Any, positionAtParent: js.Any): js.Promise[_] = js.native
  
  def toPrefix(position: js.Any): js.Any = js.native
  
  def updateHamtDirectory(context: js.Any, links: js.Any, bucket: js.Any, options: js.Any): js.Promise[Node] = js.native
}
