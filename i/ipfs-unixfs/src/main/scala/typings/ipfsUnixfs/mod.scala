package typings.ipfsUnixfs

import typings.ipfsUnixfs.anon.BlockSizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ipfs-unixfs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ipfs-unixfs", "UnixFS")
  @js.native
  /**
    * @param {object} [options]
    * @param {string} [options.type='file']
    * @param {Uint8Array} [options.data]
    * @param {number[]} [options.blockSizes]
    * @param {number} [options.hashType]
    * @param {number} [options.fanout]
    * @param {MtimeLike | null} [options.mtime]
    * @param {number | string} [options.mode]
    */
  open class UnixFS () extends StObject {
    def this(options: BlockSizes) = this()
    
    var _mode: js.UndefOr[Double] = js.native
    
    var _originalMode: Double = js.native
    
    /**
      * @param {number} size
      */
    def addBlockSize(size: Double): Unit = js.native
    
    /** @type {number[]} */
    var blockSizes: js.Array[Double] = js.native
    
    var data: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    var fanout: js.UndefOr[Double] = js.native
    
    /**
      * Returns `0` for directories or `data.length + sum(blockSizes)` for everything else
      */
    def fileSize(): Double = js.native
    
    var hashType: js.UndefOr[Double] = js.native
    
    def isDirectory(): Boolean = js.native
    
    /**
      * encode to protobuf Uint8Array
      */
    def marshal(): js.typedarray.Uint8Array = js.native
    
    /**
      * @returns {number | undefined}
      */
    def mode: js.UndefOr[Double] = js.native
    /**
      * @param {number | undefined} mode
      */
    def mode_=(arg: js.UndefOr[Double]): Unit = js.native
    
    var mtime: js.UndefOr[typings.ipfsUnixfs.typesMod.Mtime] = js.native
    
    /**
      * @param {number} index
      */
    def removeBlockSize(index: Double): Unit = js.native
    
    var `type`: String = js.native
  }
  /* static members */
  object UnixFS {
    
    @JSImport("ipfs-unixfs", "UnixFS")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Decode from protobuf https://github.com/ipfs/specs/blob/master/UNIXFS.md
      *
      * @param {Uint8Array} marshaled
      */
    inline def unmarshal(marshaled: js.typedarray.Uint8Array): UnixFS = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshal")(marshaled.asInstanceOf[js.Any]).asInstanceOf[UnixFS]
  }
  
  inline def parseMode(): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMode")().asInstanceOf[js.UndefOr[Double]]
  inline def parseMode(mode: String): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMode")(mode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  inline def parseMode(mode: Double): js.UndefOr[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMode")(mode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double]]
  
  inline def parseMtime(input: Any): js.UndefOr[typings.ipfsUnixfs.typesMod.Mtime] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMtime")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.ipfsUnixfs.typesMod.Mtime]]
  
  type Mtime = typings.ipfsUnixfs.typesMod.Mtime
  
  type MtimeLike = typings.ipfsUnixfs.typesMod.MtimeLike
}
