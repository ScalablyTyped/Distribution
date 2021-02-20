package typings.jestSerializer

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("jest-serializer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jest-serializer", "default.deserialize")
    @js.native
    def deserialize: js.Function1[/* buffer */ Buffer, js.Any] = js.native
    @JSImport("jest-serializer", "default.deserialize")
    @js.native
    def deserialize(buffer: Buffer): js.Any = js.native
    @scala.inline
    def deserialize_=(x: js.Function1[/* buffer */ Buffer, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-serializer", "default.readFileSync")
    @js.native
    def readFileSync: js.Function1[/* filePath */ Path, js.Any] = js.native
    @JSImport("jest-serializer", "default.readFileSync")
    @js.native
    def readFileSync(filePath: Path): js.Any = js.native
    @scala.inline
    def readFileSync_=(x: js.Function1[/* filePath */ Path, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readFileSync")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-serializer", "default.serialize")
    @js.native
    def serialize: js.Function1[/* content */ js.Any, Buffer] = js.native
    @JSImport("jest-serializer", "default.serialize")
    @js.native
    def serialize(content: js.Any): Buffer = js.native
    @scala.inline
    def serialize_=(x: js.Function1[/* content */ js.Any, Buffer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-serializer", "default.writeFileSync")
    @js.native
    def writeFileSync: js.Function2[/* filePath */ Path, /* content */ js.Any, Unit] = js.native
    @JSImport("jest-serializer", "default.writeFileSync")
    @js.native
    def writeFileSync(filePath: Path, content: js.Any): Unit = js.native
    @scala.inline
    def writeFileSync_=(x: js.Function2[/* filePath */ Path, /* content */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeFileSync")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("jest-serializer", "deserialize")
  @js.native
  def deserialize(buffer: Buffer): js.Any = js.native
  
  @JSImport("jest-serializer", "readFileSync")
  @js.native
  def readFileSync(filePath: Path): js.Any = js.native
  
  @JSImport("jest-serializer", "serialize")
  @js.native
  def serialize(content: js.Any): Buffer = js.native
  
  @JSImport("jest-serializer", "writeFileSync")
  @js.native
  def writeFileSync(filePath: Path, content: js.Any): Unit = js.native
  
  type Path = String
}
