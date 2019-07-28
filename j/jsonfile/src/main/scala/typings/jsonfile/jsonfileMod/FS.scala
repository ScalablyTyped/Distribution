package typings.jsonfile.jsonfileMod

import typings.jsonfile.Anon_Callback
import typings.jsonfile.Anon_CallbackData
import typings.jsonfile.Fn_Data
import typings.jsonfile.Fn_Options
import typings.node.Anon_EncodingFlag
import typings.node.Anon_EncodingFlagNull
import typings.node.Anon_EncodingFlagString
import typings.node.Buffer
import typings.node.NodeJSNs.ErrnoException
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FS extends js.Object {
  @JSName("readFileSync")
  var readFileSync_Original: Fn_Options = js.native
  @JSName("readFile")
  var readFile_Original: Anon_Callback = js.native
  @JSName("writeFileSync")
  var writeFileSync_Original: Fn_Data = js.native
  @JSName("writeFile")
  var writeFile_Original: Anon_CallbackData = js.native
  def readFile(path: Double, callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]): Unit = js.native
  def readFile(
    path: Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
  ): Unit = js.native
  def readFile(
    path: Double,
    options: String,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* data */ String), Unit]
  ): Unit = js.native
  def readFile(
    path: Double,
    options: Null,
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
  ): Unit = js.native
  def readFile(
    path: Double,
    options: Anon_EncodingFlagNull,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String | Buffer, Unit]
  ): Unit = js.native
  def readFile(
    path: Double,
    options: Anon_EncodingFlagString,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  def readFile(
    path: Double,
    options: Anon_EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
  ): Unit = js.native
  def readFile(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]): Unit = js.native
  def readFile(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
  ): Unit = js.native
  def readFile(
    path: PathLike,
    options: String,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* data */ String), Unit]
  ): Unit = js.native
  def readFile(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | String, Unit]
  ): Unit = js.native
  def readFile(
    path: PathLike,
    options: Anon_EncodingFlagNull,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String | Buffer, Unit]
  ): Unit = js.native
  def readFile(
    path: PathLike,
    options: Anon_EncodingFlagString,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ String, Unit]
  ): Unit = js.native
  def readFile(
    path: PathLike,
    options: Anon_EncodingFlag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
  ): Unit = js.native
  def readFileSync(path: Double): Buffer = js.native
  def readFileSync(path: Double, options: String): String | Buffer = js.native
  def readFileSync(path: Double, options: Anon_EncodingFlag): Buffer = js.native
  def readFileSync(path: Double, options: Anon_EncodingFlagNull): String | Buffer = js.native
  def readFileSync(path: Double, options: Anon_EncodingFlagString): String = js.native
  def readFileSync(path: PathLike): Buffer = js.native
  def readFileSync(path: PathLike, options: String): String | Buffer = js.native
  def readFileSync(path: PathLike, options: Anon_EncodingFlag): Buffer = js.native
  def readFileSync(path: PathLike, options: Anon_EncodingFlagNull): String | Buffer = js.native
  def readFileSync(path: PathLike, options: Anon_EncodingFlagString): String = js.native
  @JSName("readFileSync")
  def readFileSync_String(path: Double, options: String): String = js.native
  @JSName("readFileSync")
  def readFileSync_String(path: PathLike, options: String): String = js.native
  @JSName("readFileSync")
  def readFileSync_Union(path: Double): String | Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Union(path: PathLike): String | Buffer = js.native
  def writeFile(path: Double, data: js.Any, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def writeFile(
    path: Double,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def writeFile(path: PathLike, data: js.Any, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def writeFile(
    path: PathLike,
    data: js.Any,
    options: WriteFileOptions,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def writeFileSync(path: Double, data: js.Any): Unit = js.native
  def writeFileSync(path: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
  def writeFileSync(path: PathLike, data: js.Any): Unit = js.native
  def writeFileSync(path: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
}

