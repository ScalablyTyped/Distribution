package typings.hlsJs.mod

import typings.hlsJs.anon.Code
import typings.hlsJs.hlsJsStrings.AUDIO
import typings.hlsJs.hlsJsStrings.VIDEO
import typings.std.MediaKeySystemAccess
import typings.std.MediaKeySystemConfiguration
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AudioPlaylistType = AUDIO

type AudioTrackLoadedData = TrackLoadedData

type ElementaryStreams = Record[ElementaryStreamTypes, ElementaryStreamInfo | Null]

type FragmentLoadProgressCallback = js.Function1[/* result */ FragLoadedData, Unit]

type ILogFunction = js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]

type LiveBackBufferData = BackBufferData

type LoaderOnAbort[T /* <: LoaderContext */] = js.Function3[/* stats */ LoaderStats, /* context */ T, /* networkDetails */ Any, Unit]

type LoaderOnError[T /* <: LoaderContext */] = js.Function3[/* error */ Code, /* context */ T, /* networkDetails */ Any, Unit]

type LoaderOnProgress[T /* <: LoaderContext */] = js.Function4[
/* stats */ LoaderStats, 
/* context */ T, 
/* data */ String | js.typedarray.ArrayBuffer, 
/* networkDetails */ Any, 
Unit]

type LoaderOnSuccess[T /* <: LoaderContext */] = js.Function4[
/* response */ LoaderResponse, 
/* stats */ LoaderStats, 
/* context */ T, 
/* networkDetails */ Any, 
Unit]

type LoaderOnTimeout[T /* <: LoaderContext */] = js.Function3[/* stats */ LoaderStats, /* context */ T, /* networkDetails */ Any, Unit]

type MainPlaylistType = AudioPlaylistType | VIDEO

type MediaKeyFunc = js.Function2[
/* keySystem */ KeySystems, 
/* supportedConfigurations */ js.Array[MediaKeySystemConfiguration], 
js.Promise[MediaKeySystemAccess]]

type MediaPlaylistType = MainPlaylistType | SubtitlePlaylistType

type SubtitleTrackLoadedData = TrackLoadedData
