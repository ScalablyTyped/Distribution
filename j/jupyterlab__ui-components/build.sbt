organization := "org.scalablytyped"
name := "jupyterlab__ui-components"
version := "2.2.4-f70fcd"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "2.6.14-dc2f99",
  "org.scalablytyped" %%% "free-style" % "3.1.0-732fd9",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.3.3-f7d114",
  "org.scalablytyped" %%% "lumino__commands" % "1.11.4-ca0aaa",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.5.3-c6b4ee",
  "org.scalablytyped" %%% "lumino__disposable" % "1.4.3-bfd119",
  "org.scalablytyped" %%% "lumino__messaging" % "1.4.3-773aa2",
  "org.scalablytyped" %%% "lumino__signaling" % "1.4.3-0ab4bb",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.7.3-fbb1df",
  "org.scalablytyped" %%% "lumino__widgets" % "1.14.1-f94c29",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-3fbed9",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-4ff700",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "typestyle" % "2.1.0-68b563")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
