package typings.ipfsCore.addMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddOptions extends js.Object {
  
  /**
    * - chunking algorithm used to build ipfs DAGs (default: `'size-262144'`)
    */
  var chunker: js.UndefOr[String] = js.native
  
  /**
    * - the CID version to use when storing the data (default: `0`)
    */
  var cidVersion: js.UndefOr[Double] = js.native
  
  /**
    * - multihash hashing algorithm to use (default: `'sha2-256'`)
    */
  var hashAlg: js.UndefOr[String] = js.native
  
  /**
    * - If true, will not add blocks to the blockstore (default: `false`)
    */
  var onlyHash: js.UndefOr[Boolean] = js.native
  
  /**
    * - pin this object when adding (default: `true`)
    */
  var pin: js.UndefOr[Boolean] = js.native
  
  /**
    * - a function that will be called with the number of bytes added as a file is added to ipfs and the path of the file being added
    */
  var progress: js.UndefOr[js.Function2[/* bytes */ Double, /* path */ String, Unit]] = js.native
  
  /**
    * - if true, DAG leaves will contain raw file data and not be wrapped in a protobuf (default: `false`)
    */
  var rawLeaves: js.UndefOr[Boolean] = js.native
  
  /**
    * - if true will use the [trickle DAG](https://godoc.org/github.com/ipsn/go-ipfs/gxlibs/github.com/ipfs/go-unixfs/importer/trickle) format for DAG generation (default: `false`)
    */
  var trickle: js.UndefOr[Boolean] = js.native
  
  /**
    * - Adds a wrapping node around the content (default: `false`)
    */
  var wrapWithDirectory: js.UndefOr[Boolean] = js.native
}
object AddOptions {
  
  @scala.inline
  def apply(): AddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddOptions]
  }
  
  @scala.inline
  implicit class AddOptionsOps[Self <: AddOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChunker(value: String): Self = this.set("chunker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunker: Self = this.set("chunker", js.undefined)
    
    @scala.inline
    def setCidVersion(value: Double): Self = this.set("cidVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidVersion: Self = this.set("cidVersion", js.undefined)
    
    @scala.inline
    def setHashAlg(value: String): Self = this.set("hashAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashAlg: Self = this.set("hashAlg", js.undefined)
    
    @scala.inline
    def setOnlyHash(value: Boolean): Self = this.set("onlyHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyHash: Self = this.set("onlyHash", js.undefined)
    
    @scala.inline
    def setPin(value: Boolean): Self = this.set("pin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePin: Self = this.set("pin", js.undefined)
    
    @scala.inline
    def setProgress(value: (/* bytes */ Double, /* path */ String) => Unit): Self = this.set("progress", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setRawLeaves(value: Boolean): Self = this.set("rawLeaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawLeaves: Self = this.set("rawLeaves", js.undefined)
    
    @scala.inline
    def setTrickle(value: Boolean): Self = this.set("trickle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrickle: Self = this.set("trickle", js.undefined)
    
    @scala.inline
    def setWrapWithDirectory(value: Boolean): Self = this.set("wrapWithDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapWithDirectory: Self = this.set("wrapWithDirectory", js.undefined)
  }
}
