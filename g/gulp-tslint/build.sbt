organization := "org.scalablytyped"
name := "gulp-tslint"
version := "8.1.4-023a95"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-53fbc6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-d84c1e",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20190212Z-68f577",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-483c07",
  "org.scalablytyped" %%% "chalk" % "2.4.2-ca1e30",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-5a34a6",
  "org.scalablytyped" %%% "commander" % "2.19.0-4db880",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190322Z-05edd1",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-faeaa3",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-0a41ad",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ce8e08",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-bb4a1b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-6520aa",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-7a822c",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20190322Z-90adb9",
  "org.scalablytyped" %%% "semver" % "6.0-dt-20190330Z-1b8b1f",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-1b70da",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-77ab79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32",
  "org.scalablytyped" %%% "tslint" % "5.15.0-a557c4",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-d5afaa",
  "org.scalablytyped" %%% "typescript" % "3.4.1-a42773")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        