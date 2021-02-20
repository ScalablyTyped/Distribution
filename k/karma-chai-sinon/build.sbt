organization := "org.scalablytyped"
name := "karma-chai-sinon"
version := "0.1.5-dt-20201002Z-ec2ff7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "chai" % "4.2-dt-20201016Z-13f2a6",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-bb1238",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-4689f3",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
