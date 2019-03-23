organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.7.0-6e0ae9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-escapes" % "3.0-dt-20190306Z-030e91",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-052e82",
  "org.scalablytyped" %%% "chalk" % "2.4.2-273699",
  "org.scalablytyped" %%% "cli-cursor" % "2.1-dt-20181224Z-f8078c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1b784",
  "org.scalablytyped" %%% "cross-spawn" % "6.0-dt-20190228Z-ff0fa9",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-1f537b",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-8c7bf5",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ab02fa",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190322Z-4ea1ab",
  "org.scalablytyped" %%% "ionic__utils-array" % "0.0.1-9de01e",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.2.0-5d184d",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-cc0668",
  "org.scalablytyped" %%% "ionic__utils-process" % "0.1.0-8d4d3b",
  "org.scalablytyped" %%% "ionic__utils-stream" % "0.0.1-a44beb",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "0.1.0-e8678f",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "0.0.1-7b4e18",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "log-update" % "3.1.0-30e2e4",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-b5ce4c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-364729",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-e722b1",
  "org.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181119Z-254b3c",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180530Z-d5df25",
  "org.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180214Z-81a205",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-155129",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-172fb0",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-af9181",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-3c1239",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180214Z-05242b",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20190322Z-f18588",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-e2790f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        