organization := "org.scalablytyped"
name := "karma-chai-sinon"
version := "0.1.5-dt-20220818Z-6ee4e5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chai" % "4.3-dt-20221107Z-0deb78",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-e69298",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-ad21fc",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
